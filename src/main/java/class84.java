import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class84 implements class35 {

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Lie;")
    private class61 field2140 = new class61();

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    private int field2145 = 128;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "D")
    private double field2148 = 1.0D;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    private int field2146 = 0;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    private int field2147;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "Lq;")
    private class111 field2144;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "[Lae;")
    private class6[] field2136;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field2123 = 0;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lkd;")
    public static class73 field2126 = class126.method1070((byte) -66, "<col=00ff00>");

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Lkd;")
    public static class73 field2127 = class126.method1070((byte) -66, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Lkd;")
    public static class73 field2134 = class126.method1070((byte) -66, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Lkd;")
    public static class73 field2135 = class126.method1070((byte) -66, "title)3jpg");

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lkd;")
    public static class73 field2131 = class126.method1070((byte) -66, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Lkd;")
    public static class73 field2133 = class126.method1070((byte) -66, " ");

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "Lua;")
    public static class137 field2142;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Lde;")
    public static class27 field2138;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "[Lpb;")
    public static class106[] field2125;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public final void method707(boolean arg0) {
        field2128++;
        if (!arg0) {
            this.method279((byte) -35, 77);
        }
        for (int var2 = 0; var2 < this.field2136.length; var2++) {
            if (this.field2136[var2] != null) {
                this.field2136[var2].method26();
            }
        }
        this.field2140 = new class61();
        this.field2146 = this.field2147;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)[I")
    public final int[] method278(int arg0, int arg1) {
        field2143++;
        if (arg0 != -25663) {
            field2123 = 6;
        }
        class6 var3 = this.field2136[arg1];
        if (var3 != null) {
            if (var3.field197 != null) {
                this.field2140.method510(-29474, var3);
                var3.field196 = true;
                return var3.field197;
            }
            boolean var4 = var3.method28(this.field2148, this.field2145, this.field2144);
            if (var4) {
                if (this.field2146 == 0) {
                    class6 var5 = (class6) this.field2140.method515((byte) 119);
                    var5.method26();
                } else {
                    this.field2146--;
                }
                this.field2140.method510(-29474, var3);
                var3.field196 = true;
                return var3.field197;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)I")
    public final int method280(int arg0, byte arg1) {
        field2132++;
        if (arg1 == 3) {
            return this.field2136[arg0] == null ? 0 : this.field2136[arg0].field200;
        } else {
            return -15;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(JI)Lkd;")
    public static final class73 method708(long arg0, int arg1) {
        if (arg1 <= 89) {
            return null;
        }
        field2130++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class141.field3514[(int) (var8 - arg0 * 37L)];
            }
            class73 var7 = new class73();
            var7.field1858 = var6;
            var7.field1880 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Z)V")
    public static void method709(boolean arg0) {
        field2134 = null;
        if (arg0) {
            field2126 = null;
        }
        field2142 = null;
        field2131 = null;
        field2127 = null;
        field2135 = null;
        field2133 = null;
        field2125 = null;
        field2126 = null;
        field2138 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ID)V")
    public final void method710(int arg0, double arg1) {
        field2137++;
        this.field2148 = arg1;
        if (arg0 != 0) {
            field2126 = null;
        }
        this.method707(true);
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)V")
    public final void method711(int arg0, int arg1) {
        if (arg1 != 1) {
            field2134 = null;
        }
        for (int var3 = 0; var3 < this.field2136.length; var3++) {
            class6 var4 = this.field2136[var3];
            if (var4 != null && var4.field203 != 0 && var4.field196) {
                var4.method29(arg0);
                var4.field196 = false;
            }
        }
        field2141++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Z")
    public final boolean method277(int arg0, int arg1) {
        if (arg1 != -27724) {
            this.method280(69, (byte) -19);
        }
        field2129++;
        return this.field2136[arg0].field198;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)Z")
    public final boolean method279(byte arg0, int arg1) {
        if (arg0 >= -75) {
            return true;
        } else {
            field2122++;
            return this.field2145 == 64;
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(Z)V")
    public static final void method712(boolean arg0) {
        class73 var1 = null;
        for (int var2 = 0; var2 < class129.field3262; var2++) {
            if (class54.field1440[var2].method623(-1893532698, class131.field3299) != -1) {
                var1 = class54.field1440[var2].method638(class54.field1440[var2].method623(-1893532698, class131.field3299), -69);
                break;
            }
        }
        field2124++;
        if (var1 == null) {
            class146.method1169((byte) 59);
            return;
        }
        int var3 = class39.field1059;
        if (var3 < 0) {
            var3 = 0;
        }
        int var4 = class126.field3183;
        int var5 = class143.field3556;
        int var6 = class103.field2568;
        int var7 = 6116423;
        if (var4 > 190) {
            var4 = 190;
        }
        class17.method133(var3, var6, var4, var5, var7);
        class17.method133(var3 + 1, var6 + 1, var4 - 2, 16, 0);
        if (arg0) {
            return;
        }
        class17.method134(var3 + 1, var6 + 18, var4 - 2, var5 + -19, 0);
        class58.field1553.method355(var1, var3 + 3, var6 + 14, var7, -1);
        int var8 = class31.field869;
        int var9 = class3.field161;
        if (class50.field1333 == 0) {
            var8 -= 4;
            var9 -= 4;
        }
        if (class50.field1333 == 1) {
            var8 -= 553;
            var9 -= 205;
        }
        if (class50.field1333 == 2) {
            var8 -= 17;
            var9 -= 357;
        }
        for (int var10 = 0; var10 < class129.field3262; var10++) {
            int var11 = (class129.field3262 - var10 - 1) * 15 + var6 + 31;
            int var12 = 16777215;
            if (var8 > var3 && var8 < var3 + var4 && var11 - 13 < var9 && var11 + 3 > var9) {
                var12 = 16776960;
            }
            class73 var13 = class54.field1440[var10];
            if (var13.method627(2858, var1)) {
                var13 = var13.method630(var13.method632((byte) -100) - var1.method632((byte) -97), 0, -24023);
                if (var13.method627(2858, class136.field3382)) {
                    var13 = var13.method630(var13.method632((byte) -77) - class136.field3382.method632((byte) -119), 0, -24023);
                }
            }
            class58.field1553.method355(var13, var3 + 3, var11, var12, 0);
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(II)I")
    public static int method713(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lq;Lq;IDI)V")
    public class84(class111 arg0, class111 arg1, int arg2, double arg3, int arg4) {
        this.field2147 = arg2;
        this.field2146 = this.field2147;
        this.field2148 = arg3;
        this.field2144 = arg1;
        this.field2145 = arg4;
        int[] var7 = arg0.method896((byte) 123, 0);
        int var8 = var7.length;
        this.field2136 = new class6[arg0.method889(-1, 0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class114 var10 = new class114(arg0.method898((byte) -49, var7[var9], 0));
            this.field2136[var7[var9]] = new class6(var10);
        }
    }
}
