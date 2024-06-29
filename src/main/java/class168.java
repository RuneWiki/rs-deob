import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class168 implements class32 {

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "Z")
    private boolean field2698 = true;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    public static int field2714 = 0;

    @OriginalMember(owner = "client!uf", name = "pb", descriptor = "[I")
    public static int[] field2750 = new int[2000];

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public int field2692;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    private int field2708;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!uf", name = "X", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!uf", name = "Y", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!uf", name = "bb", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!uf", name = "cb", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!uf", name = "db", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!uf", name = "eb", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!uf", name = "fb", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!uf", name = "gb", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!uf", name = "hb", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!uf", name = "ib", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!uf", name = "jb", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!uf", name = "kb", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!uf", name = "lb", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!uf", name = "mb", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!uf", name = "nb", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!uf", name = "qb", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Z")
    public static boolean field2687;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "[B")
    public byte[] field2716;

    @OriginalMember(owner = "client!uf", name = "ob", descriptor = "[[[B")
    public static byte[][][] field2749;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)I", line = 8)
    public final int method1167(boolean arg0) {
        field2728++;
        if (arg0) {
            this.method1169((byte) -80, 98, (class168) null, 3);
        }
        return this.field2692;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)Luf;", line = 21)
    public final class168 method1168(int arg0, int arg1, int arg2) {
        field2729++;
        byte var4 = (byte) arg1;
        byte var5 = (byte) arg2;
        class168 var6 = new class168();
        var6.field2692 = this.field2692;
        var6.field2716 = new byte[this.field2692];
        for (int var7 = 0; var7 < this.field2692; var7++) {
            byte var8 = this.field2716[var7];
            if (var4 == var8) {
                var6.field2716[var7] = var5;
            } else {
                var6.field2716[var7] = var8;
            }
        }
        if (arg0 != -12907) {
            field2749 = (byte[][][]) ((byte[][][]) null);
        }
        return var6;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BILuf;I)Luf;", line = 57)
    public final class168 method1169(byte arg0, int arg1, class168 arg2, int arg3) {
        field2695++;
        if (!this.field2698) {
            throw new IllegalArgumentException();
        } else if (arg3 >= 0 && arg3 <= arg1 && arg1 <= arg2.field2692) {
            this.field2708 = 0;
            if (this.field2716.length < this.field2692 + arg1 - arg3) {
                int var5;
                for (var5 = 1; var5 < this.field2692 + arg2.field2692; var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class185.method1308(this.field2716, 0, var6, 0, this.field2692);
                this.field2716 = var6;
            }
            class185.method1308(arg2.field2716, arg3, this.field2716, this.field2692, arg1 - arg3);
            this.field2692 += arg1 - arg3;
            if (arg0 <= 34) {
                method1183((class241) null, -100, 90);
            }
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Luf;B)Z", line = 103)
    public final boolean method1170(class168 arg0, byte arg1) {
        field2733++;
        if (arg0 == null) {
            return false;
        } else if (this.field2692 == arg0.field2692) {
            int var3 = 121 / ((29 - arg1) / 58);
            if (!this.field2698 || !arg0.field2698) {
                if (this.field2708 == 0) {
                    this.field2708 = this.method1181((byte) -45);
                    if (this.field2708 == 0) {
                        this.field2708 = 1;
                    }
                }
                if (arg0.field2708 == 0) {
                    arg0.field2708 = arg0.method1181((byte) -45);
                    if (arg0.field2708 == 0) {
                        arg0.field2708 = 1;
                    }
                }
                if (this.field2708 != arg0.field2708) {
                    return false;
                }
            }
            for (int var4 = 0; var4 < this.field2692; var4++) {
                if (this.field2716[var4] != arg0.field2716[var4]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)I", line = 159)
    public final int method1171(int arg0, int arg1) {
        field2741++;
        return arg0 == -6146 ? this.field2716[arg1] & 0xFF : -29;
    }

    @OriginalMember(owner = "client!uf", name = "hashCode", descriptor = "()I", line = 170)
    public final int hashCode() {
        field2735++;
        return this.method1181((byte) -45);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 178)
    public static final void method1172(int arg0) {
        field2689++;
        if (arg0 == 0) {
            class155.field2456 = null;
            class184.method1306();
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I", line = 193)
    public final int method1173(byte arg0, FontMetrics arg1) {
        field2703++;
        if (arg0 != -100) {
            this.field2692 = 101;
        }
        String var3;
        try {
            var3 = new String(this.field2716, 0, this.field2692, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field2716, 0, this.field2692);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Z)[B", line = 219)
    public final byte[] method1174(boolean arg0) {
        field2709++;
        if (!arg0) {
            this.field2698 = true;
        }
        byte[] var2 = new byte[this.field2692];
        class185.method1308(this.field2716, 0, var2, 0, this.field2692);
        return var2;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Luf;Luf;Z)Luf;", line = 233)
    public final class168 method1175(class168 arg0, class168 arg1, boolean arg2) {
        field2690++;
        int var4 = this.field2692;
        int var5 = arg1.field2692 - arg0.field2692;
        int var6 = 0;
        while (true) {
            int var7 = this.method1204(-31138, var6, arg0);
            if (var7 < 0) {
                int var8 = 0;
                if (arg2) {
                    return (class168) null;
                }
                class168 var9 = class126.method891(true, var4);
                while (true) {
                    int var10 = this.method1204(-31138, var8, arg0);
                    if (var10 < 0) {
                        while (this.field2692 > var8) {
                            var9.method1212(118, this.field2716[var8++] & 0xFF);
                        }
                        return var9;
                    }
                    while (var10 > var8) {
                        var9.method1212(117, this.field2716[var8++] & 0xFF);
                    }
                    var9.method1207(24017, arg1);
                    var8 += arg0.field2692;
                }
            }
            var4 += var5;
            var6 = var7 + arg0.field2692;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)Z", line = 288)
    private final boolean method1176(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var3 = -93 % ((69 - arg1) / 32);
        boolean var4 = false;
        field2736++;
        boolean var5 = false;
        int var6 = 0;
        for (int var7 = 0; var7 < this.field2692; var7++) {
            int var8 = this.field2716[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var4 = true;
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
            if (var4) {
                var8 = -var8;
            }
            int var9 = arg0 * var6 + var8;
            if (var9 / arg0 != var6) {
                return false;
            }
            var5 = true;
            var6 = var9;
        }
        return var5;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILuf;)I", line = 373)
    public final int method1177(int arg0, class168 arg1) {
        int var3;
        if (this.field2692 > arg1.field2692) {
            var3 = arg1.field2692;
        } else {
            var3 = this.field2692;
        }
        field2685++;
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field2716[var4] & 0xFF) < (arg1.field2716[var4] & 0xFF)) {
                return -1;
            }
            if ((arg1.field2716[var4] & 0xFF) < (this.field2716[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1.field2692 > this.field2692) {
            return -1;
        }
        if (arg0 != 1) {
            this.field2708 = -83;
        }
        if (this.field2692 > arg1.field2692) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILjava/applet/Applet;)V", line = 413)
    public final void method1178(int arg0, Applet arg1) throws Throwable {
        String var3 = new String(this.field2716, 0, this.field2692);
        if (arg0 != -47) {
            this.field2708 = -81;
        }
        class97.method737(var3, (byte) 0, arg1);
        field2745++;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)Luf;", line = 427)
    public final class168 method1179(int arg0, int arg1) {
        field2694++;
        if (arg1 < 79) {
            this.field2692 = 104;
        }
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class168 var3 = new class168();
        var3.field2716 = new byte[this.field2692 + 1];
        var3.field2692 = this.field2692 + 1;
        class185.method1308(this.field2716, 0, var3.field2716, 0, this.field2692);
        var3.field2716[this.field2692] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(ILjava/applet/Applet;)Ljava/lang/Object;", line = 452)
    public final Object method1180(int arg0, Applet arg1) throws Throwable {
        String var3 = new String(this.field2716, arg0, this.field2692);
        Object var4 = class97.method738(arg0 ^ 0x3ABE, arg1, (Object[]) null, var3);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class183.method1302((byte) -10, 0, var5.length, var5);
        }
        field2702++;
        return var4;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)I", line = 475)
    public final int method1181(byte arg0) {
        field2722++;
        int var2 = 0;
        if (arg0 != -45) {
            this.method1209((byte) -13);
        }
        for (int var3 = 0; var3 < this.field2692; var3++) {
            var2 = (var2 << 5) + (this.field2716[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)J", line = 496)
    public final long method1182(int arg0) {
        long var2 = 0L;
        if (arg0 != -16010) {
            return -55L;
        }
        for (int var4 = 0; var4 < this.field2692; var4++) {
            var2 = (var2 << 5) + (((long) (this.field2716[var4] & 0xFF)) - var2);
        }
        field2742++;
        return var2;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ldk;II)Lwa;", line = 515)
    public static final class284 method1183(class241 arg0, int arg1, int arg2) {
        if (arg2 == 255) {
            field2717++;
            return class254.method1748(arg0, arg2 ^ 0xFE, arg1) ? class195.method1371(-123) : null;
        } else {
            return (class284) null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ljf;", line = 530)
    public static final class8 method1184(Throwable arg0, String arg1) {
        class8 var2;
        if (arg0 instanceof class8) {
            var2 = (class8) arg0;
            var2.field107 = var2.field107 + ' ' + arg1;
        } else {
            var2 = new class8(arg0, arg1);
        }
        field2724++;
        return var2;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(ILuf;)Z", line = 547)
    public final boolean method1185(int arg0, class168 arg1) {
        field2737++;
        if (arg1.field2692 > this.field2692) {
            return false;
        }
        int var3 = this.field2692 - arg1.field2692;
        for (int var4 = arg0; var4 < arg1.field2692; var4++) {
            if (this.field2716[var4 + var3] != arg1.field2716[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IBILdk;)Lwa;", line = 575)
    public static final class284 method1186(int arg0, byte arg1, int arg2, class241 arg3) {
        field2684++;
        if (arg1 == 0) {
            return class28.method148(arg0, arg3, arg2, arg1 ^ 0xFFFFFFDA) ? class195.method1371(arg1 - 94) : null;
        } else {
            return (class284) null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(III)Luf;", line = 591)
    public final class168 method1187(int arg0, int arg1, int arg2) {
        field2730++;
        class168 var4 = new class168();
        var4.field2716 = new byte[arg2 - arg0];
        var4.field2692 = arg2 - arg0;
        class185.method1308(this.field2716, arg0, var4.field2716, arg1, var4.field2692);
        return var4;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZII[BI)I", line = 609)
    public final int method1188(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field2719++;
        if (!arg0) {
            this.equals((Object) null);
        }
        class185.method1308(this.field2716, arg1, arg3, arg4, arg2 - arg1);
        return arg2 - arg1;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILuf;Luf;)V", line = 628)
    public static final void method1189(int arg0, int arg1, class168 arg2, class168 arg3) {
        field2731++;
        class182.field2921 = arg3;
        class267.field4512 = false;
        class80.field1143 = 0;
        class187.field2977 = arg0;
        class182.field2931 = arg2;
        if (class182.field2921.method1170(class182.field2934, (byte) 125) || class182.field2931.method1170(class182.field2934, (byte) 121)) {
            class165.field2638 = 3;
            class51.field621 = 0;
            return;
        }
        int var4 = -21 / ((4 - arg1) / 53);
        class279.field4687 = 0;
        class197.field3262 = 0;
        class165.field2638 = -3;
        class51.field621 = 1;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(II)I", line = 659)
    public final int method1190(int arg0, int arg1) {
        boolean var3 = false;
        int var4 = 0;
        int var5 = -117 / ((-arg0 - 48) / 37);
        field2744++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var6 = false;
        for (int var7 = 0; var7 < this.field2692; var7++) {
            int var8 = this.field2716[var7] & 0xFF;
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
                throw new NumberFormatException();
            }
            if (arg1 <= var8) {
                throw new NumberFormatException();
            }
            if (var3) {
                var8 = -var8;
            }
            int var9 = arg1 * var4 + var8;
            if (var9 / arg1 != var4) {
                throw new NumberFormatException();
            }
            var4 = var9;
            var6 = true;
        }
        if (!var6) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(II)[Luf;", line = 740)
    public final class168[] method1191(int arg0, int arg1) {
        field2747++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2692; var4++) {
            if (this.field2716[var4] == arg1) {
                var3++;
            }
        }
        class168[] var5 = new class168[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        if (arg0 > -48) {
            this.method1205(false, -100, 88);
        }
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field2716[var7 + var9] != arg1; var9++) {
            }
            var5[var6++] = this.method1187(var7, 0, var7 + var9);
            var7 += var9 + 1;
        }
        var5[var3] = this.method1187(var7, 0, this.field2692);
        return var5;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)Z", line = 795)
    public final boolean method1192(int arg0) {
        field2699++;
        if (arg0 != 255) {
            field2687 = true;
        }
        return this.method1176(10, (byte) 102);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)Luf;", line = 811)
    public final class168 method1193(byte arg0, int arg1) {
        if (arg0 != -86) {
            this.field2708 = -116;
        }
        field2710++;
        return this.method1187(arg1, arg0 + 86, this.field2692);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Luf;I)Z", line = 829)
    public final boolean method1194(class168 arg0, int arg1) {
        field2720++;
        if (arg0 == null) {
            return false;
        } else if (this.field2692 == arg0.field2692) {
            for (int var3 = 0; var3 < this.field2692; var3++) {
                byte var4 = this.field2716[var3];
                byte var5 = arg0.field2716[var3];
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
            if (arg1 != -26023) {
                this.field2692 = 30;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(Z)Luf;", line = 870)
    public final class168 method1195(boolean arg0) {
        field2697++;
        int var2 = 0;
        int var3 = this.field2692;
        while (this.field2692 > var2 && (this.field2716[var2] >= 0 && this.field2716[var2] <= 32 || (this.field2716[var2] & 0xFF) == 160)) {
            var2++;
        }
        while (var3 > var2 && (this.field2716[var3 - 1] >= 0 && this.field2716[var3 - 1] <= 32 || (this.field2716[var3 - 1] & 0xFF) == 160)) {
            var3--;
        }
        if (var2 == 0 && this.field2692 == var3) {
            return this;
        }
        class168 var4 = new class168();
        var4.field2692 = var3 - var2;
        if (arg0) {
            this.method1168(-51, 20, 117);
        }
        var4.field2716 = new byte[var4.field2692];
        for (int var5 = 0; var5 < var4.field2692; var5++) {
            var4.field2716[var5] = this.field2716[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Luf;I)I", line = 906)
    public final int method1196(class168 arg0, int arg1) {
        if (arg1 != 187) {
            field2687 = false;
        }
        field2715++;
        return this.method1204(-31138, 0, arg0);
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)Luf;", line = 918)
    public final class168 method1197(int arg0) {
        class168 var2 = new class168();
        var2.field2692 = this.field2692;
        field2727++;
        var2.field2716 = new byte[this.field2692];
        if (arg0 != -96) {
            this.method1219(-40, 64);
        }
        for (int var3 = 0; var3 < this.field2692; var3++) {
            byte var4 = this.field2716[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field2716[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V", line = 955)
    public final void method1198(byte arg0) {
        field2707++;
        if (arg0 <= 117) {
            this.method1198((byte) 86);
        }
        String var2;
        try {
            var2 = new String(this.field2716, 0, this.field2692, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field2716, 0, this.field2692);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(ILuf;)Z", line = 987)
    public final boolean method1199(int arg0, class168 arg1) {
        field2704++;
        if (arg1.field2692 > this.field2692) {
            return false;
        }
        int var3 = -6 / ((43 - arg0) / 53);
        for (int var4 = 0; var4 < arg1.field2692; var4++) {
            if (this.field2716[var4] != arg1.field2716[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)I", line = 1017)
    public final int method1200(byte arg0) {
        int var2 = -122 / ((arg0 - 73) / 49);
        field2693++;
        return this.method1190(0, 10);
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(B)Luf;", line = 1028)
    public final class168 method1201(byte arg0) {
        field2705++;
        if (!this.field2698) {
            throw new IllegalArgumentException();
        } else if (arg0 == -98) {
            this.field2708 = 0;
            if (this.field2716.length != this.field2692) {
                byte[] var2 = new byte[this.field2692];
                class185.method1308(this.field2716, 0, var2, 0, this.field2692);
                this.field2716 = var2;
            }
            return this;
        } else {
            return (class168) null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLuf;)Z", line = 1062)
    public final boolean method1202(byte arg0, class168 arg1) {
        field2734++;
        if (this.field2692 < arg1.field2692) {
            return false;
        } else if (arg0 == 20) {
            for (int var3 = 0; var3 < arg1.field2692; var3++) {
                byte var4 = arg1.field2716[var3];
                byte var5 = this.field2716[var3];
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
            return true;
        }
    }

    @OriginalMember(owner = "client!uf", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 1099)
    public final boolean equals(Object arg0) {
        field2718++;
        if (!arg0 instanceof class168) {
            throw new IllegalArgumentException();
        }
        return this.method1170((class168) arg0, (byte) 127);
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)[B", line = 1116)
    public final byte[] method1203(int arg0) {
        field2732++;
        if (this.field2692 == 0) {
            return new byte[0];
        }
        if (arg0 <= 68) {
            this.field2708 = 72;
        }
        int var2 = this.field2692 + 3 & 0xFFFFFFFC;
        int var3 = var2 / 4 * 3;
        if (var2 - 2 >= this.field2692 || class60.method335(false, this.field2716[var2 - 2]) == -1) {
            var3 -= 2;
        } else if ((var2 - 1) >= this.field2692 || class60.method335(false, this.field2716[var2 - 1]) == -1) {
            var3--;
        }
        byte[] var4 = new byte[var3];
        this.method1222(0, (byte) -114, var4);
        return var4;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILuf;)I", line = 1146)
    public final int method1204(int arg0, int arg1, class168 arg2) {
        field2683++;
        int[] var4 = new int[arg2.field2692];
        int[] var5 = new int[256];
        int[] var6 = new int[arg2.field2692];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg2.field2692;
        }
        if (arg0 != -31138) {
            field2714 = 14;
        }
        for (int var8 = 1; var8 <= arg2.field2692; var8++) {
            var4[var8 - 1] = (arg2.field2692 << 1) - var8;
            var5[class159.method1119(255, arg2.field2716[var8 - 1])] = arg2.field2692 - var8;
        }
        int var9 = arg2.field2692 + 1;
        for (int var10 = arg2.field2692; var10 > 0; var10--) {
            var6[var10 - 1] = var9;
            while (var9 <= arg2.field2692 && arg2.field2716[var9 - 1] != arg2.field2716[var10 - 1]) {
                if (arg2.field2692 - var10 <= var4[var9 + -1]) {
                    var4[var9 - 1] = arg2.field2692 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
        }
        int var11 = 1;
        int var12 = var9;
        int var13 = 0;
        int var14 = arg2.field2692 + 1 - var9;
        int var15 = 1;
        while (var15 <= var14) {
            var6[var15 - 1] = var13;
            while (var13 >= 1 && arg2.field2716[var13 - 1] != arg2.field2716[var15 - 1]) {
                var13 = var6[var13 - 1];
            }
            var15++;
            var13++;
        }
        while (var12 < arg2.field2692) {
            for (int var16 = var11; var16 <= var12; var16++) {
                if (arg2.field2692 + var12 - var16 <= var4[var16 + -1]) {
                    var4[var16 - 1] = arg2.field2692 + var12 - var16;
                }
            }
            var11 = var12 + 1;
            var12 = var12 + var14 - var6[var14 + -1];
            var14 = var6[var14 - 1];
        }
        int var18;
        for (int var17 = arg1 + arg2.field2692 - 1; var17 < this.field2692; var17 += Math.max(var5[this.field2716[var17] & 0xFF], var4[var18])) {
            for (var18 = arg2.field2692 - 1; var18 >= 0 && this.field2716[var17] == arg2.field2716[var18]; var18--) {
                var17--;
            }
            if (var18 == -1) {
                return var17 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZII)I", line = 1257)
    public final int method1205(boolean arg0, int arg1, int arg2) {
        byte var4 = (byte) arg2;
        field2751++;
        for (int var5 = arg1; var5 < this.field2692; var5++) {
            if (this.field2716[var5] == var4) {
                return var5;
            }
        }
        if (arg0) {
            this.field2708 = 57;
        }
        return -1;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/net/URL;B)Ljava/net/URL;", line = 1286)
    public final URL method1206(URL arg0, byte arg1) throws MalformedURLException {
        if (arg1 <= 23) {
            return (URL) null;
        } else {
            field2706++;
            return new URL(arg0, new String(this.field2716, 0, this.field2692));
        }
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(ILuf;)Luf;", line = 1300)
    public final class168 method1207(int arg0, class168 arg1) {
        field2686++;
        if (!this.field2698) {
            throw new IllegalArgumentException();
        }
        this.field2708 = 0;
        if (this.field2716.length < (this.field2692 + arg1.field2692)) {
            int var3;
            for (var3 = 1; var3 < (this.field2692 + arg1.field2692); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class185.method1308(this.field2716, 0, var4, 0, this.field2692);
            this.field2716 = var4;
        }
        class185.method1308(arg1.field2716, 0, this.field2716, this.field2692, arg1.field2692);
        if (arg0 == 24017) {
            this.field2692 += arg1.field2692;
            return this;
        } else {
            return (class168) null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(B)J", line = 1350)
    public final long method1208(byte arg0) {
        field2746++;
        long var2 = 0L;
        if (arg0 != 71) {
            this.method1209((byte) 93);
        }
        for (int var4 = 0; var4 < this.field2692 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field2716[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (1 - (65 - var5));
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 + 1 - 97);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 + 27 - 48);
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(B)Luf;", line = 1390)
    public final class168 method1209(byte arg0) {
        field2748++;
        if (arg0 != -109) {
            return (class168) null;
        }
        long var2 = this.method1182(-16010);
        synchronized (uf.class) {
            if (class8.field99 == null) {
                class8.field99 = new class80(4096);
            } else {
                for (class188 var5 = (class188) class8.field99.method493(var2, 127); var5 != null; var5 = (class188) class8.field99.method496(false)) {
                    if (this.method1170(var5.field2985, (byte) 120)) {
                        return var5.field2985;
                    }
                }
            }
            class188 var6 = new class188();
            var6.field2985 = this;
            this.field2698 = false;
            class8.field99.method490(var6, var2, true);
            return this;
        }
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V", line = 1429)
    public static void method1210(int arg0) {
        if (arg0 == 0) {
            field2750 = null;
            field2749 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZIIILdk;II)V", line = 1441)
    public static final void method1211(boolean arg0, int arg1, int arg2, int arg3, class241 arg4, int arg5, int arg6) {
        class151.field2345 = arg1;
        field2696++;
        class14.field145 = arg2;
        class285.field4825 = arg0;
        class157.field2478 = arg3;
        class83.field1261 = 1;
        if (arg6 != -11) {
            method1172(107);
        }
        class300.field5091 = arg4;
        class282.field4765 = arg5;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(II)Luf;", line = 1462)
    public final class168 method1212(int arg0, int arg1) {
        field2691++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field2698) {
            this.field2708 = 0;
            if (arg0 <= 113) {
                field2687 = false;
            }
            if (this.field2716.length == this.field2692) {
                int var3;
                for (var3 = 1; var3 <= this.field2692; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class185.method1308(this.field2716, 0, var4, 0, this.field2692);
                this.field2716 = var4;
            }
            this.field2716[this.field2692++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Loe;III)V", line = 1514)
    public static final void method1213(class54 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -18679) {
            field2749 = (byte[][][]) ((byte[][][]) null);
        }
        if (arg0.field3044 == arg1 && arg1 != -1) {
            class190 var4 = class119.method858(true, arg1);
            int var5 = var4.field3060;
            if (var5 == 1) {
                arg0.field3009 = 0;
                arg0.field3054 = 0;
                arg0.field3041 = 0;
                arg0.field3005 = arg3;
                class27.method142(var4, (byte) -119, arg0.field3027, arg0.field3009, arg0.field3021, class266.field4489 == arg0);
            }
            if (var5 == 2) {
                arg0.field3041 = 0;
            }
        } else if (arg1 == -1 || arg0.field3044 == -1 || class119.method858(true, arg1).field3059 >= class119.method858(true, arg0.field3044).field3059) {
            arg0.field3009 = 0;
            arg0.field3043 = arg0.field2997;
            arg0.field3054 = 0;
            arg0.field3005 = arg3;
            arg0.field3041 = 0;
            arg0.field3044 = arg1;
            if (arg0.field3044 != -1) {
                class27.method142(class119.method858(true, arg0.field3044), (byte) -119, arg0.field3027, arg0.field3009, arg0.field3021, class266.field4489 == arg0);
            }
        }
        field2738++;
    }

    @OriginalMember(owner = "client!uf", name = "toString", descriptor = "()Ljava/lang/String;", line = 1563)
    public final String toString() {
        field2726++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(II)I", line = 1578)
    public final int method1214(int arg0, int arg1) {
        byte var3 = (byte) arg1;
        field2725++;
        int var4 = 0;
        for (int var5 = arg0; var5 < this.field2692; var5++) {
            if (this.field2716[var5] == var3) {
                var4++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "(I)Luf;", line = 1604)
    public final class168 method1215(int arg0) {
        field2723++;
        if (arg0 != 4767) {
            this.method1185(-19, (class168) null);
        }
        class168 var2 = class69.method388(this.method1208((byte) 71), (byte) 104);
        return var2 == null ? class43.field531 : var2;
    }

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "(I)Luf;", line = 1623)
    public final class168 method1216(int arg0) {
        field2743++;
        boolean var2 = true;
        if (arg0 != -32471) {
            field2687 = true;
        }
        class168 var3 = new class168();
        var3.field2692 = this.field2692;
        var3.field2716 = new byte[this.field2692];
        for (int var4 = 0; var4 < this.field2692; var4++) {
            byte var5 = this.field2716[var4];
            if (var5 == 95) {
                var3.field2716[var4] = 32;
                var2 = true;
            } else if (var5 >= 97 && var5 <= 122 && var2) {
                var2 = false;
                var3.field2716[var4] = (byte) (var5 - 32);
            } else {
                var3.field2716[var4] = var5;
                var2 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "(B)Luf;", line = 1670)
    public final class168 method1217(byte arg0) {
        field2712++;
        byte var2 = 2;
        class168 var3 = new class168();
        if (arg0 <= 61) {
            this.method1191(-81, -75);
        }
        var3.field2692 = this.field2692;
        var3.field2716 = new byte[this.field2692];
        for (int var4 = 0; var4 < this.field2692; var4++) {
            byte var5 = this.field2716[var4];
            if (!(var5 < 97 || var5 > 122) || !(var5 < -32 || var5 > -2 || var5 == -9)) {
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
            var3.field2716[var4] = var5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "(B)Ljava/net/URL;", line = 1733)
    public final URL method1218(byte arg0) throws MalformedURLException {
        field2721++;
        return arg0 <= 125 ? (URL) null : new URL(new String(this.field2716, 0, this.field2692));
    }

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "(II)V", line = 1752)
    public final void method1219(int arg0, int arg1) {
        this.field2708 = 0;
        field2740++;
        if (!this.field2698) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 > this.field2716.length) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class185.method1308(this.field2716, 0, var4, 0, this.field2692);
                this.field2716 = var4;
            }
            if (arg1 == 1) {
                for (int var5 = this.field2692; var5 < arg0; var5++) {
                    this.field2716[var5] = 32;
                }
                this.field2692 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/applet/Applet;Z)Luf;", line = 1803)
    public final class168 method1220(Applet arg0, boolean arg1) {
        if (arg1) {
            this.method1223((class168) null, (byte) -15);
        }
        field2739++;
        String var3 = new String(this.field2716, 0, this.field2692);
        String var4 = arg0.getParameter(var3);
        return var4 == null ? null : class124.method880(15170, var4);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 1824)
    public final void method1221(Graphics arg0, int arg1, int arg2, int arg3) {
        field2688++;
        String var5;
        try {
            var5 = new String(this.field2716, arg1, this.field2692, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field2716, 0, this.field2692);
        }
        arg0.drawString(var5, arg2, arg3);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB[B)I", line = 1839)
    private final int method1222(int arg0, byte arg1, byte[] arg2) {
        field2711++;
        int var4 = 84 % ((arg1 + 57) / 37);
        int var5 = arg0;
        for (int var6 = 0; var6 < this.field2692; var6 += 4) {
            int var7 = class60.method335(false, this.field2716[var6]);
            int var8 = var6 + 1 >= this.field2692 ? -1 : class60.method335(false, this.field2716[var6 + 1]);
            int var9 = this.field2692 <= var6 + 2 ? -1 : class60.method335(false, this.field2716[var6 + 2]);
            int var10 = (var6 + 3) < this.field2692 ? class60.method335(false, this.field2716[var6 + 3]) : -1;
            arg2[arg0++] = (byte) class80.method492(var7 << 2, var8 >>> 4);
            if (var9 == -1) {
                break;
            }
            arg2[arg0++] = (byte) class80.method492(var9 >>> 2, class159.method1119(15, var8) << 4);
            if (var10 == -1) {
                break;
            }
            arg2[arg0++] = (byte) class80.method492(class159.method1119(192, var9 << 6), var10);
        }
        return arg0 - var5;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Luf;B)I", line = 1881)
    public final int method1223(class168 arg0, byte arg1) {
        field2713++;
        int var3 = 0;
        int var4 = 0;
        int var5 = this.field2692;
        int var6 = arg0.field2692;
        int var7 = this.field2692;
        int var8 = arg0.field2692;
        int var9 = 0;
        if (arg1 > -124) {
            field2687 = false;
        }
        int var10 = 0;
        while (var5 != 0 && var6 != 0) {
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = this.field2716[var10] & 0xFF;
                var10++;
            }
            if (class261.method1822(var3, (byte) 84)) {
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
                var4 = arg0.field2716[var9] & 0xFF;
                var9++;
            }
            if (class261.method1822(var4, (byte) 84)) {
                var8++;
            } else {
                var6--;
            }
            if (class102.field1591[var4] > class102.field1591[var3]) {
                return -1;
            }
            if (class102.field1591[var4] < class102.field1591[var3]) {
                return 1;
            }
        }
        if (var8 <= var7) {
            return var7 > var8 ? 1 : 0;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IB)I", line = 1972)
    public final int method1224(int arg0, byte arg1) {
        field2700++;
        return arg1 <= 85 ? 24 : this.method1205(false, 0, arg0);
    }
}
