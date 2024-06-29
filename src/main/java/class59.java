import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class59 implements class304 {

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "Z")
    private boolean field886 = true;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "Ltl;")
    private static class59 field864 = class85.method639("Loading config )2 ", 9588);

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "Ltl;")
    public static class59 field875 = class85.method639("Hidden)2", 9588);

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
    public static int field882 = 0;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    public static int field879 = 50;

    @OriginalMember(owner = "client!tl", name = "N", descriptor = "[I")
    public static int[] field896 = new int[field879];

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "Ltl;")
    public static class59 field872 = field864;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "[Ltl;")
    public static class59[] field877 = new class59[field879];

    @OriginalMember(owner = "client!tl", name = "T", descriptor = "[I")
    public static int[] field902 = new int[field879];

    @OriginalMember(owner = "client!tl", name = "bb", descriptor = "I")
    public static int field910 = 0;

    @OriginalMember(owner = "client!tl", name = "ob", descriptor = "[I")
    public static int[] field923 = new int[field879];

    @OriginalMember(owner = "client!tl", name = "nb", descriptor = "Z")
    public static boolean field922 = false;

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "[I")
    public static int[] field892 = new int[field879];

    @OriginalMember(owner = "client!tl", name = "sb", descriptor = "[I")
    public static int[] field927 = new int[field879];

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "[I")
    public static int[] field878 = new int[field879];

    @OriginalMember(owner = "client!tl", name = "Q", descriptor = "[I")
    public static int[] field899 = new int[field879];

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public int field863;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!tl", name = "O", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!tl", name = "P", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!tl", name = "R", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!tl", name = "S", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!tl", name = "U", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!tl", name = "V", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!tl", name = "W", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!tl", name = "X", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!tl", name = "Y", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!tl", name = "Z", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!tl", name = "ab", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!tl", name = "cb", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!tl", name = "db", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!tl", name = "eb", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!tl", name = "fb", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!tl", name = "gb", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!tl", name = "hb", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!tl", name = "ib", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!tl", name = "jb", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!tl", name = "lb", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!tl", name = "mb", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!tl", name = "pb", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!tl", name = "qb", descriptor = "I")
    private int field925;

    @OriginalMember(owner = "client!tl", name = "rb", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!tl", name = "tb", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!tl", name = "ub", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!tl", name = "vb", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!tl", name = "wb", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!tl", name = "xb", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!tl", name = "kb", descriptor = "Lgg;")
    public static class47 field919;

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "[B")
    public byte[] field889;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)Ltl;", line = 5)
    public final class59 method451(byte arg0) {
        field913++;
        if (arg0 >= -109) {
            this.method452(-114);
        }
        class59 var2 = class151.method1085(1, this.method488((byte) 120));
        return var2 == null ? class23.field303 : var2;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)Ltl;", line = 24)
    public final class59 method452(int arg0) {
        int var2 = 0;
        field887++;
        while (var2 < this.field863 && (this.field889[var2] >= 0 && this.field889[var2] <= 32 || (this.field889[var2] & 0xFF) == 160)) {
            var2++;
        }
        int var3;
        for (var3 = this.field863; var2 < var3 && (this.field889[var3 - 1] >= 0 && this.field889[var3 - 1] <= 32 || (this.field889[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field863 == var3) {
            return this;
        }
        class59 var4 = new class59();
        var4.field863 = var3 - var2;
        var4.field889 = new byte[var4.field863];
        if (arg0 == 255) {
            for (int var5 = 0; var5 < var4.field863; var5++) {
                var4.field889[var5] = this.field889[var2 + var5];
            }
            return var4;
        } else {
            return (class59) null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ltl;B)Z", line = 62)
    public final boolean method453(class59 arg0, byte arg1) {
        field859++;
        if (arg0 == null) {
            return false;
        } else if (this.field863 == arg0.field863) {
            if (!this.field886 || !arg0.field886) {
                if (this.field925 == 0) {
                    this.field925 = this.method467(false);
                    if (this.field925 == 0) {
                        this.field925 = 1;
                    }
                }
                if (arg0.field925 == 0) {
                    arg0.field925 = arg0.method467(false);
                    if (arg0.field925 == 0) {
                        arg0.field925 = 1;
                    }
                }
                if (this.field925 != arg0.field925) {
                    return false;
                }
            }
            int var3 = 0;
            if (arg1 > -24) {
                this.method473(-37, 106, (byte) 40);
            }
            while (this.field863 > var3) {
                if (this.field889[var3] != arg0.field889[var3]) {
                    return false;
                }
                var3++;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILtl;)Z", line = 116)
    public static final boolean method454(int arg0, class59 arg1) {
        field866++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class293.field5001; var2++) {
            if (arg1.method472(class88.field1380[var2], 90)) {
                return true;
            }
        }
        if (arg0 != -1801) {
            method465(false, 125, 91, true, false);
        }
        if (arg1.method472(class286.field4920.field1663, 90)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Z", line = 165)
    private final boolean method455(int arg0, int arg1) {
        field881++;
        boolean var3 = false;
        boolean var4 = false;
        if (arg1 != -11895) {
            return false;
        }
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < this.field863; var6++) {
            int var7 = this.field889[var6] & 0xFF;
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
            if (arg0 <= var7) {
                return false;
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                return false;
            }
            var5 = var8;
            var3 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)Z", line = 243)
    public final boolean method456(int arg0) {
        int var2 = 65 % ((32 - arg0) / 39);
        field893++;
        return this.method455(10, -11895);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)Ljava/net/URL;", line = 258)
    public final URL method457(byte arg0) throws MalformedURLException {
        if (arg0 == 65) {
            field894++;
            return new URL(new String(this.field889, 0, this.field863));
        } else {
            return (URL) null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "([BIBII)I", line = 275)
    public final int method458(byte[] arg0, int arg1, byte arg2, int arg3, int arg4) {
        field869++;
        int var6 = -76 / ((arg2 + 51) / 44);
        class63.method520(this.field889, arg1, arg0, arg4, arg3 - arg1);
        return arg3 - arg1;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)[B", line = 287)
    public final byte[] method459(int arg0) {
        if (arg0 != 1647627301) {
            field899 = (int[]) null;
        }
        field900++;
        byte[] var2 = new byte[this.field863];
        class63.method520(this.field889, 0, var2, 0, this.field863);
        return var2;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Ltl;B)Z", line = 307)
    public final boolean method460(class59 arg0, byte arg1) {
        field917++;
        if (this.field863 < arg0.field863) {
            return false;
        }
        int var3 = this.field863 - arg0.field863;
        if (arg1 <= 28) {
            this.method499((class59) null, (byte) 86);
        }
        for (int var4 = 0; var4 < arg0.field863; var4++) {
            if (this.field889[var3 + var4] != arg0.field889[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/applet/Applet;I)Ljava/lang/Object;", line = 338)
    public final Object method461(Applet arg0, int arg1) throws Throwable {
        field914++;
        String var3 = new String(this.field889, 0, this.field863);
        Object var4 = class89.method661((Object[]) null, var3, -1827, arg0);
        if (arg1 != -8660) {
            this.method482(-3);
        }
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class316.method2176(0, var5.length, true, var5);
        }
        return var4;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ltl;I)Ltl;", line = 370)
    public final class59 method462(class59 arg0, int arg1) {
        field867++;
        if (!this.field886) {
            throw new IllegalArgumentException();
        }
        this.field925 = 0;
        if (this.field889.length < this.field863 + arg0.field863) {
            int var3;
            for (var3 = 1; var3 < (this.field863 + arg0.field863); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class63.method520(this.field889, 0, var4, 0, this.field863);
            this.field889 = var4;
        }
        int var5 = -120 % ((62 - arg1) / 58);
        class63.method520(arg0.field889, 0, this.field889, this.field863, arg0.field863);
        this.field863 += arg0.field863;
        return this;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/applet/Applet;B)V", line = 408)
    public final void method463(Applet arg0, byte arg1) throws Throwable {
        field883++;
        String var3 = new String(this.field889, 0, this.field863);
        if (arg1 != -20) {
            field879 = 67;
        }
        class89.method662(var3, true, arg0);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/net/URL;)Ljava/net/URL;", line = 425)
    public final URL method464(int arg0, URL arg1) throws MalformedURLException {
        if (arg0 == 2) {
            field885++;
            return new URL(arg1, new String(this.field889, 0, this.field863));
        } else {
            return (URL) null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZIIZZ)Lme;", line = 444)
    public static final class295 method465(boolean arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field921++;
        class154 var5 = null;
        if (arg1 < 92) {
            return (class295) null;
        }
        if (class56.field840 != null) {
            var5 = new class154(arg2, class56.field840, class209.field3410[arg2], 1000000);
        }
        class67.field1030[arg2] = class105.field1777.method1608(client.field625, arg2, var5, (byte) -128);
        if (arg3) {
            class67.field1030[arg2].method1632(-1);
        }
        return new class295(class67.field1030[arg2], arg4, arg0);
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)Ltl;", line = 467)
    public final class59 method466(int arg0) {
        if (arg0 < 117) {
            this.method480((byte) -37);
        }
        class59 var2 = new class59();
        field857++;
        var2.field863 = this.field863;
        var2.field889 = new byte[this.field863];
        for (int var3 = 0; var3 < this.field863; var3++) {
            byte var4 = this.field889[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field889[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)I", line = 521)
    public final int method467(boolean arg0) {
        field871++;
        if (arg0) {
            field922 = false;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field863; var3++) {
            var2 = (var2 << 5) + (this.field889[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)Ltl;", line = 544)
    public final class59 method468(int arg0) {
        field895++;
        class59 var2 = new class59();
        var2.field863 = this.field863;
        var2.field889 = new byte[var2.field863];
        for (int var3 = arg0; var3 < this.field863; var3++) {
            var2.field889[this.field863 - var3 - 1] = this.field889[var3];
        }
        return var2;
    }

    @OriginalMember(owner = "client!tl", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 563)
    public final boolean equals(Object arg0) {
        field860++;
        if (!arg0 instanceof class59) {
            throw new IllegalArgumentException();
        }
        return this.method453((class59) arg0, (byte) -120);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ltl;Ltl;I)Ltl;", line = 577)
    public final class59 method469(class59 arg0, class59 arg1, int arg2) {
        field926++;
        int var4 = this.field863;
        int var5 = arg0.field863 - arg1.field863;
        int var6 = 0;
        while (true) {
            int var7 = this.method481(arg1, (byte) -16, var6);
            if (var7 < 0) {
                if (arg2 != 25600) {
                    this.method460((class59) null, (byte) 108);
                }
                class59 var8 = class90.method670(0, var4);
                int var9 = 0;
                while (true) {
                    int var10 = this.method481(arg1, (byte) -66, var9);
                    if (var10 < 0) {
                        while (var9 < this.field863) {
                            var8.method484(this.field889[var9++] & 0xFF, (byte) -106);
                        }
                        return var8;
                    }
                    while (var9 < var10) {
                        var8.method484(this.field889[var9++] & 0xFF, (byte) -105);
                    }
                    var8.method462(arg0, -80);
                    var9 += arg1.field863;
                }
            }
            var6 = arg1.field863 + var7;
            var4 += var5;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)V", line = 637)
    public final void method470(byte arg0, int arg1) {
        field911++;
        if (arg0 < 7) {
            return;
        }
        this.field925 = 0;
        if (!this.field886) {
            throw new IllegalArgumentException();
        } else if (arg1 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (this.field889.length < arg1) {
                int var3;
                for (var3 = 1; var3 < arg1; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class63.method520(this.field889, 0, var4, 0, this.field863);
                this.field889 = var4;
            }
            for (int var5 = this.field863; var5 < arg1; var5++) {
                this.field889[var5] = 32;
            }
            this.field863 = arg1;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)I", line = 687)
    public final int method471(int arg0, byte arg1) {
        if (arg1 >= -90) {
            this.method473(3, 51, (byte) 29);
        }
        field924++;
        int var3 = 0;
        byte var4 = (byte) arg0;
        for (int var5 = 0; var5 < this.field863; var5++) {
            if (this.field889[var5] == var4) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Ltl;I)Z", line = 712)
    public final boolean method472(class59 arg0, int arg1) {
        field870++;
        if (arg1 != 90) {
            return false;
        } else if (arg0 == null) {
            return false;
        } else if (this.field863 == arg0.field863) {
            for (int var3 = 0; var3 < this.field863; var3++) {
                byte var4 = this.field889[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg0.field889[var3];
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

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIB)Ltl;", line = 754)
    public final class59 method473(int arg0, int arg1, byte arg2) {
        field901++;
        class59 var4 = new class59();
        var4.field863 = arg0 - arg1;
        if (arg2 <= 31) {
            field919 = (class47) null;
        }
        var4.field889 = new byte[arg0 - arg1];
        class63.method520(this.field889, arg1, var4.field889, 0, var4.field863);
        return var4;
    }

    @OriginalMember(owner = "client!tl", name = "hashCode", descriptor = "()I", line = 771)
    public final int hashCode() {
        field905++;
        return this.method467(false);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)Lsk;", line = 779)
    public static final class201 method474(int arg0, int arg1, int arg2) {
        class245 var3 = class120.field2010[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4098;
    }

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)Ltl;", line = 792)
    public final class59 method475(int arg0) {
        field907++;
        long var2 = this.method486(false);
        if (arg0 <= 103) {
            this.method462((class59) null, 40);
        }
        synchronized (tl.class) {
            if (class174.field2857 == null) {
                class174.field2857 = new class94(4096);
            } else {
                for (class252 var5 = (class252) class174.field2857.method685(var2, 128); var5 != null; var5 = (class252) class174.field2857.method688(127)) {
                    if (this.method453(var5.field4195, (byte) -104)) {
                        return var5.field4195;
                    }
                }
            }
            class252 var6 = new class252();
            var6.field4195 = this;
            this.field886 = false;
            class174.field2857.method694(var6, (byte) -90, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(III)I", line = 834)
    public final int method476(int arg0, int arg1, int arg2) {
        field928++;
        byte var4 = (byte) arg1;
        for (int var5 = arg2; var5 < this.field863; var5++) {
            if (this.field889[var5] == var4) {
                return var5;
            }
        }
        if (arg0 != 0) {
            this.method488((byte) -4);
        }
        return -1;
    }

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "(I)V", line = 865)
    public static void method477(int arg0) {
        field923 = null;
        field919 = null;
        field927 = null;
        field875 = null;
        field899 = null;
        field896 = null;
        field892 = null;
        field872 = null;
        field902 = null;
        field877 = null;
        field878 = null;
        if (arg0 != -1078388958) {
            field927 = (int[]) null;
        }
        field864 = null;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(Ltl;B)I", line = 887)
    public final int method478(class59 arg0, byte arg1) {
        int var3 = -84 / ((arg1 - 43) / 56);
        field898++;
        return this.method481(arg0, (byte) 113, 0);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(ILtl;)I", line = 900)
    public final int method479(int arg0, class59 arg1) {
        if (arg0 != -1) {
            return 66;
        }
        int var3 = 0;
        field904++;
        int var4 = arg1.field863;
        int var5 = 0;
        int var6 = this.field863;
        int var7 = this.field863;
        int var8 = arg1.field863;
        int var9 = 0;
        int var10 = 0;
        while (var6 != 0 && var4 != 0) {
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = this.field889[var9] & 0xFF;
                var9++;
            }
            if (class178.method1319(-199, var3)) {
                var7++;
            } else {
                var6--;
            }
            if (var5 == 156 || var5 == 230) {
                var5 = 101;
            } else if (var5 == 140 || var5 == 198) {
                var5 = 69;
            } else if (var5 == 223) {
                var5 = 115;
            } else {
                var5 = arg1.field889[var10] & 0xFF;
                var10++;
            }
            if (class178.method1319(arg0 - 198, var5)) {
                var8++;
            } else {
                var4--;
            }
            if (class247.field4118[var5] > class247.field4118[var3]) {
                return -1;
            }
            if (class247.field4118[var5] < class247.field4118[var3]) {
                return 1;
            }
        }
        if (var7 < var8) {
            return -1;
        } else if (var7 > var8) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)Ltl;", line = 995)
    public final class59 method480(byte arg0) {
        class59 var2 = new class59();
        var2.field863 = this.field863;
        boolean var3 = true;
        var2.field889 = new byte[this.field863];
        field920++;
        if (arg0 < 32) {
            this.method498((class59) null, (byte) 99, 0, -120);
        }
        for (int var4 = 0; var4 < this.field863; var4++) {
            byte var5 = this.field889[var4];
            if (var5 == 95) {
                var2.field889[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field889[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var3 = false;
                var2.field889[var4] = var5;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tl", name = "toString", descriptor = "()Ljava/lang/String;", line = 1039)
    public final String toString() {
        field931++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ltl;BI)I", line = 1054)
    public final int method481(class59 arg0, byte arg1, int arg2) {
        field906++;
        int[] var4 = new int[arg0.field863];
        int[] var5 = new int[arg0.field863];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < var6.length; var7++) {
            var6[var7] = arg0.field863;
        }
        for (int var8 = 1; var8 <= arg0.field863; var8++) {
            var4[var8 - 1] = (arg0.field863 << 1) - var8;
            var6[class93.method680(255, arg0.field889[var8 - 1])] = arg0.field863 - var8;
        }
        int var9 = arg0.field863 + 1;
        for (int var10 = arg0.field863; var10 > 0; var10--) {
            var5[var10 - 1] = var9;
            while (var9 <= arg0.field863 && arg0.field889[var9 - 1] != arg0.field889[var10 - 1]) {
                if (var4[var9 - 1] >= arg0.field863 - var10) {
                    var4[var9 - 1] = arg0.field863 - var10;
                }
                var9 = var5[var9 - 1];
            }
            var9--;
        }
        int var11 = var9;
        int var12 = 1;
        int var13 = 0;
        int var14 = -30 % ((arg1 - 66) / 36);
        int var15 = arg0.field863 + 1 - var9;
        for (int var16 = 1; var16 <= var15; var16++) {
            var5[var16 - 1] = var13;
            while (var13 >= 1 && arg0.field889[var13 - 1] != arg0.field889[var16 - 1]) {
                var13 = var5[var13 - 1];
            }
            var13++;
        }
        while (var11 < arg0.field863) {
            for (int var17 = var12; var17 <= var11; var17++) {
                if (arg0.field863 + var11 - var17 <= var4[var17 + -1]) {
                    var4[var17 - 1] = var11 + arg0.field863 - var17;
                }
            }
            var12 = var11 + 1;
            var11 -= var5[var15 - 1] - var15;
            var15 = var5[var15 - 1];
        }
        int var19;
        for (int var18 = arg0.field863 + arg2 - 1; var18 < this.field863; var18 += Math.max(var6[this.field889[var18] & 0xFF], var4[var19])) {
            for (var19 = arg0.field863 - 1; var19 >= 0 && this.field889[var18] == arg0.field889[var19]; var19--) {
                var18--;
            }
            if (var19 == -1) {
                return var18 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "(I)Ltl;", line = 1171)
    public final class59 method482(int arg0) {
        field861++;
        class59 var2 = new class59();
        var2.field863 = this.field863;
        var2.field889 = new byte[this.field863];
        byte var3 = 2;
        int var4 = 0;
        if (arg0 != -27509) {
            return (class59) null;
        }
        while (this.field863 > var4) {
            byte var5 = this.field889[var4];
            if (!(var5 < 97 || var5 > 122) || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (!(var5 < 65 || var5 > 90) || !(var5 < -64 || var5 > -34 || var5 == -41)) {
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
            var2.field889[var4] = var5;
            var4++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)I", line = 1229)
    public final int method483(int arg0, int arg1) {
        if (arg1 != -37) {
            return 49;
        }
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        field865++;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field863; var6++) {
            int var7 = this.field889[var6] & 0xFF;
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
            if (arg0 <= var7) {
                throw new NumberFormatException();
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if ((var8 / arg0) != var5) {
                throw new NumberFormatException();
            }
            var3 = true;
            var5 = var8;
        }
        if (!var3) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(IB)Ltl;", line = 1303)
    public final class59 method484(int arg0, byte arg1) {
        field873++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (!this.field886) {
            throw new IllegalArgumentException();
        } else if (arg1 >= -39) {
            return (class59) null;
        } else {
            this.field925 = 0;
            if (this.field889.length == this.field863) {
                int var3;
                for (var3 = 1; var3 <= this.field863; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class63.method520(this.field889, 0, var4, 0, this.field863);
                this.field889 = var4;
            }
            this.field889[this.field863++] = (byte) arg0;
            return this;
        }
    }

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "(I)I", line = 1346)
    public final int method485(int arg0) {
        if (arg0 <= 70) {
            field919 = (class47) null;
        }
        field876++;
        return this.method483(10, -37);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)J", line = 1359)
    public final long method486(boolean arg0) {
        field929++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field863; var4++) {
            var2 = (var2 << 5) + (long) (this.field889[var4] & 0xFF) - var2;
        }
        if (arg0) {
            field875 = (class59) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(II)Ltl;", line = 1379)
    public final class59 method487(int arg0, int arg1) {
        field918++;
        if (arg1 > -57) {
            this.method490(-61);
        }
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class59 var3 = new class59();
        var3.field889 = new byte[this.field863 + 1];
        var3.field863 = this.field863 + 1;
        class63.method520(this.field889, 0, var3.field889, 0, this.field863);
        var3.field889[this.field863] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(B)J", line = 1403)
    public final long method488(byte arg0) {
        field930++;
        long var2 = 0L;
        int var4 = -62 % ((28 - arg0) / 48);
        for (int var5 = 0; this.field863 > var5 && var5 < 12; var5++) {
            byte var6 = this.field889[var5];
            var2 *= 37L;
            if (var6 >= 65 && var6 <= 90) {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 97 && var6 <= 122) {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= 48 && var6 <= 57) {
                var2 += (long) (var6 + 27 - 48);
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(IIB)Ltl;", line = 1458)
    public final class59 method489(int arg0, int arg1, byte arg2) {
        field874++;
        byte var4 = (byte) arg0;
        class59 var5 = new class59();
        var5.field863 = this.field863;
        byte var6 = (byte) arg1;
        var5.field889 = new byte[this.field863];
        for (int var7 = 0; var7 < this.field863; var7++) {
            byte var8 = this.field889[var7];
            if (var4 == var8) {
                var5.field889[var7] = var6;
            } else {
                var5.field889[var7] = var8;
            }
        }
        if (arg2 >= -10) {
            this.method458((byte[]) null, -30, (byte) 74, -78, -59);
        }
        return var5;
    }

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "(I)Ltl;", line = 1506)
    public final class59 method490(int arg0) {
        field909++;
        if (!this.field886) {
            throw new IllegalArgumentException();
        }
        this.field925 = arg0;
        if (this.field889.length != this.field863) {
            byte[] var2 = new byte[this.field863];
            class63.method520(this.field889, 0, var2, 0, this.field863);
            this.field889 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 1539)
    public final int method491(int arg0, FontMetrics arg1) {
        field858++;
        String var3;
        try {
            var3 = new String(this.field889, 0, this.field863, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field889, 0, this.field863);
        }
        if (arg0 != 0) {
            this.method452(-47);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(II)I", line = 1561)
    public final int method492(int arg0, int arg1) {
        int var3 = 60 % ((arg1 + 53) / 58);
        field903++;
        return this.field889[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(ILtl;)I", line = 1576)
    public final int method493(int arg0, class59 arg1) {
        field880++;
        int var3;
        if (arg1.field863 >= this.field863) {
            var3 = this.field863;
        } else {
            var3 = arg1.field863;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field889[var4] & 0xFF) < (arg1.field889[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field889[var4] & 0xFF) > (arg1.field889[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field863 < arg1.field863) {
            return -1;
        }
        if (arg0 != -1) {
            field864 = (class59) null;
        }
        if (this.field863 <= arg1.field863) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZ)[Ltl;", line = 1631)
    public final class59[] method494(int arg0, boolean arg1) {
        field888++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field863; var4++) {
            if (this.field889[var4] == arg0) {
                var3++;
            }
        }
        class59[] var5 = new class59[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        if (arg1) {
            this.method459(-6);
        }
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field889[var7 + var9] != arg0; var9++) {
            }
            var5[var6++] = this.method473(var7 + var9, var7, (byte) 86);
            var7 += var9 + 1;
        }
        var5[var3] = this.method473(this.field863, var7, (byte) 36);
        return var5;
    }

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "(I)I", line = 1685)
    public final int method495(int arg0) {
        field916++;
        int var2 = -64 % ((arg0 + 54) / 58);
        return this.field863;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLjava/applet/Applet;)Ltl;", line = 1701)
    public final class59 method496(byte arg0, Applet arg1) {
        String var3 = new String(this.field889, 0, this.field863);
        String var4 = arg1.getParameter(var3);
        field912++;
        if (arg0 >= -32) {
            this.method467(true);
        }
        return var4 == null ? null : class97.method735(true, var4);
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(IB)Ltl;", line = 1723)
    public final class59 method497(int arg0, byte arg1) {
        if (arg1 != 60) {
            this.method452(-106);
        }
        field890++;
        return this.method473(this.field863, arg0, (byte) 63);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ltl;BII)Ltl;", line = 1735)
    public final class59 method498(class59 arg0, byte arg1, int arg2, int arg3) {
        field862++;
        if (!this.field886) {
            throw new IllegalArgumentException();
        } else if (arg3 >= 0 && arg2 >= arg3 && arg2 <= arg0.field863) {
            this.field925 = 0;
            if (arg1 > -95) {
                return (class59) null;
            }
            if ((this.field863 + arg2 - arg3) > this.field889.length) {
                int var5;
                for (var5 = 1; var5 < this.field863 + arg0.field863; var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class63.method520(this.field889, 0, var6, 0, this.field863);
                this.field889 = var6;
            }
            class63.method520(arg0.field889, arg3, this.field889, this.field863, arg2 - arg3);
            this.field863 += arg2 - arg3;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(Ltl;B)Z", line = 1778)
    public final boolean method499(class59 arg0, byte arg1) {
        field897++;
        if (arg0.field863 > this.field863) {
            return false;
        }
        if (arg1 < 37) {
            method477(50);
        }
        for (int var3 = 0; var3 < arg0.field863; var3++) {
            byte var4 = arg0.field889[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = this.field889[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(Ltl;B)Z", line = 1815)
    public final boolean method500(class59 arg0, byte arg1) {
        field884++;
        if (arg1 < 120) {
            return true;
        } else if (arg0.field863 <= this.field863) {
            for (int var3 = 0; var3 < arg0.field863; var3++) {
                if (this.field889[var3] != arg0.field889[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 1841)
    public final void method501(int arg0, int arg1, int arg2, Graphics arg3) {
        String var5;
        try {
            var5 = new String(this.field889, arg1, this.field863, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field889, 0, this.field863);
        }
        arg3.drawString(var5, arg2, arg0);
        field891++;
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(B)V", line = 1876)
    public final void method502(byte arg0) {
        field868++;
        String var2;
        try {
            if (arg0 <= 57) {
                return;
            }
            var2 = new String(this.field889, 0, this.field863, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field889, 0, this.field863);
        }
        System.out.println(var2);
    }
}
